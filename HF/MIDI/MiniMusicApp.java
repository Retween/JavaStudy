import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicApp {

  public void play()
      throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
    Sequencer player = MidiSystem.getSequencer();
    player.open();

    Sequence seq = new Sequence(Sequence.PPQ, 4);

    Track track = seq.createTrack();

    ShortMessage a = new ShortMessage();
    a.setMessage(144, 7, 120, 100);
    MidiEvent noteOn = new MidiEvent(a, 1);
    track.add(noteOn);

    ShortMessage b = new ShortMessage();
    a.setMessage(128, 7, 127, 100);
    MidiEvent noteOff = new MidiEvent(b, 28);
    track.add(noteOff);

    player.setSequence(seq);
    player.start();
  }

  public static void main(String[] args)
      throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
    MiniMusicApp mini = new MiniMusicApp();
    mini.play();
  }

}
