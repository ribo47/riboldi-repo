package distributore;

public class BevandaNonValida 
  extends RuntimeException {
    public BevandaNonValida(String errorMessage) {
        super(errorMessage);
    }
}