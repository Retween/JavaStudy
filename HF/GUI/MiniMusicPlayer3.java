import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniMusicPlayer3 {

  static JFrame f = new JFrame("Music clip");
  static MyDrawPanel myDrawPanel;

  public static void main(String[] args) {
    MiniMusicPlayer3 player3 = new MiniMusicPlayer3();
    player3.go();
  }

  public void setUpGui() {
    myDrawPanel = new MyDrawPanel();
    f.setContentPane(myDrawPanel);
    f.setBounds(30, 30, 300, 300);
    f.setVisible(true);
  }

  public void go() {
    setUpGui();

    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.addControllerEventListener(myDrawPanel, new int[]{127});
      Sequence seq = new Sequence(Sequence.PPQ, 4);
      Track track = seq.createTrack();

      int r = 0;
      for (int i = 0; i < 60; i += 4) {
        r = (int) (Math.random() * 50 + 1);
        track.add(makeEvent(144, 1, r, 100, i));
        track.add(makeEvent(176, 1, 127, 0, i));
        track.add(makeEvent(128, 1, 4, 100, i + 2));
      }
      sequencer.setSequence(seq);
      sequencer.setTempoInBPM(120);
      sequencer.start();
    } catch (Exception e) {
    }
  }

  public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
    MidiEvent event = null;
    try {
      ShortMessage a = new ShortMessage();
      a.setMessage(comd, chan, one, two);
      MidiMessage midiMessage;
      event = new MidiEvent(a, tick);
    } catch (Exception e) {
    }
    return event;
  }

  class MyDrawPanel extends JPanel implements ControllerEventListener {

    boolean message = false;

    @Override
    public void controlChange(ShortMessage event) {
      message = true;
      repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
      if (message) {
        Graphics2D g2 = (Graphics2D) g;

        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);

        g.setColor(new Color(r, gr, b));
        int ht = (int) (Math.random() * 120 + 10);
        int wt = (int) (Math.random() * 120 + 10);

        int x = (int) (Math.random() * 40 + 10);
        int y = (int) (Math.random() * 40 + 10);

        g.fillRect(x, y, ht, wt);
        message = false;
      }
    }
  }
}
