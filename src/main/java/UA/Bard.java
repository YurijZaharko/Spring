package UA;

/**
 * Created by SC on 08.08.2016.
 */
public class Bard {
    private String name;
    private Ballada ballada;
    private Instrument instrument;

    public void sing(){
        System.out.println(name + " ");
        instrument.music();
        System.out.println(name + " ");
        ballada.song();
        System.out.println(name + " ");
        instrument.music();
    }

    public void born(){
        System.out.println(name + "I was Born");
    }

    public void kill(){
        System.out.println(name + "I was die");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ballada getBallada() {
        return ballada;
    }

    public void setBallada(Ballada ballada) {
        this.ballada = ballada;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
