package distributore;

public class CreditoInsuff 
  extends RuntimeException {
    public CreditoInsuff(String errorMessage) {
        super(errorMessage);
    }
}