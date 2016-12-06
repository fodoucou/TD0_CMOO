import java.util.Set;
import java.util.HashSet;

public class Virement {
   private double somme;
   
   private void setSomme(double value) {
      this.somme = value;
   }
   
   private double getSomme() {
      return this.somme;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Virement ------------------------- CompteAssuranceVie
    *           virement        &gt;       compteAssuranceVie
    * </pre>
    */
   private Set<CompteAssuranceVie> compteAssuranceVie;
   
   public Set<CompteAssuranceVie> getCompteAssuranceVie() {
      if (this.compteAssuranceVie == null) {
         this.compteAssuranceVie = new HashSet<CompteAssuranceVie>();
      }
      return this.compteAssuranceVie;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Virement ------------------------- CompteCourant
    *           virement        &gt;       compteCourant
    * </pre>
    */
   private Set<CompteCourant> compteCourant;
   
   public Set<CompteCourant> getCompteCourant() {
      if (this.compteCourant == null) {
         this.compteCourant = new HashSet<CompteCourant>();
      }
      return this.compteCourant;
   }
   
   }
