
public class CompteEpargne extends Compte {
   private double tauxInteret;
   
   private void setTauxInteret(double value) {
      this.tauxInteret = value;
   }
   
   private double getTauxInteret() {
      return this.tauxInteret;
   }
   
   private double plancher;
   
   private void setPlancher(double value) {
      this.plancher = value;
   }
   
   private double getPlancher() {
      return this.plancher;
   }
   
   public double verserInteret() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   private double calculerInterets() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
