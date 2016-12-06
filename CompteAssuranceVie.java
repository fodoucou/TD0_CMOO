import java.util.Set;
import java.util.HashSet;

public class CompteAssuranceVie extends CompteEpargne {
   /**
    * <pre>
    *           0..*     0..*
    * CompteAssuranceVie ------------------------- Virement
    *           compteAssuranceVie        &lt;       virement
    * </pre>
    */
   private Set<Virement> virement;
   
   public Set<Virement> getVirement() {
      if (this.virement == null) {
         this.virement = new HashSet<Virement>();
      }
      return this.virement;
   }
   
   public double solder() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
