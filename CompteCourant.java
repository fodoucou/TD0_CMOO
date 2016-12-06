import java.util.Set;
import java.util.HashSet;

public class CompteCourant extends Compte {
   private double plafondDeDecouvert;
   
   public void setPlafondDeDecouvert(double value) {
      this.plafondDeDecouvert = value;
   }
   
   public double getPlafondDeDecouvert() {
      return this.plafondDeDecouvert;
   }
   
   private double tauxAgios;
   
   public void setTauxAgios(double value) {
      this.tauxAgios = value;
   }
   
   public double getTauxAgios() {
      return this.tauxAgios;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * CompteCourant ------------------------- Virement
    *           compteCourant        &lt;       virement
    * </pre>
    */
   private Set<Virement> virement;
   
   public Set<Virement> getVirement() {
      if (this.virement == null) {
         this.virement = new HashSet<Virement>();
      }
      return this.virement;
   }
   
   }
