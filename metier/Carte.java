package metier;

public class Carte 
{
    String couleur ;
    String valeur  ;

    public Carte ( String couleur , String valeur )
    {
        this.couleur = couleur ;
        this.valeur  = valeur  ;
    }

    public Carte ( Carte c  )
    {
        this.couleur = c.getCouleur() ;
        this.valeur  = c.getValeur()  ;
    }
    
    public String getCouleur     () { return this.couleur ; }
    public String getValeur      () { return this.valeur  ; }

    public void   setCouleur ( String couleur ) { this.couleur = couleur ; }
    public void   setValeur  ( String valeur  ) { this.valeur  = valeur  ; }
}
