package metier;

public class Personne 
{
    String  pseudo ;
    boolean perdu  ;
    Carte[] main   ;
    int nbCarte    ;
    int nbMain     ; // TODO : A faire nbMain

    public Personne ( String pseudo )
    {
        this.pseudo = pseudo ;
        this.perdu  = false ;

        this.main   = new Carte[20] ;
        nbCarte     = 0 ;
        nbMain      = 0 ;
    }

    public String  getPseudo () { return this.pseudo ; }
    public Carte[] getMain   () { return this.main   ; }

    public void    setMain   ( Carte[] main  ) { this.main   = main   ; }

    public void ajouterCarte ( Carte   carte ) 
    { 
        this.main[nbCarte] = carte ;
        nbCarte ++ ;
    }

    public void estPerdu () 
    { 
        if ( this.nbMain > 21  ) this.perdu = true ;
    }

    public String jouer () // TODO : faire methode pour action joueur  
    {
        return "" ;
    }
}
