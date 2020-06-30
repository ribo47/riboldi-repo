package distributore;

public class TesseraNonValida 
  extends RuntimeException {
    public TesseraNonValida(String errorMessage) {
        super(errorMessage);
    }
}