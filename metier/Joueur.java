package metier;

public class Joueur 
{
    int     monais ; 
    String  pseudo ;
    boolean perdu  ;
    Carte[] main   ;
    int nbCarte    ;
    int nbMain     ; // TODO : A faire nbMain

    public Joueur ()
    {
        this.monais = 1000 ;
        this.pseudo = "looping" ;
        this.perdu  = false ;
        this.main   = new Carte[20] ;
        nbCarte     = 0 ;
        nbMain      = 0 ;
    }

    public int     getMonais () { return this.monais ; }
    public String  getPseudo () { return this.pseudo ; }
    public Carte[] getMain   () { return this.main   ; }

    public void setPseudo ( String  pseudo ) { this.pseudo = pseudo ; }
    public void setMain   ( Carte[] main   ) { this.main   = main   ; }
    public void setMonais ( int     monais ) { this.monais = monais ; }

    public void ajouterCarte ( Carte   carte  ) 
    { 
        this.main[nbCarte] = carte ;
        nbCarte ++ ;
    }

    public boolean miser ( int nbr )
    {
        if ( nbr <= 0          ) return false ;
        if ( nbr > this.monais ) return false ;
        return true ;
    }

    public void estPerdu () 
    { 
        if ( this.nbMain > 21  ) this.perdu = true ;
    }
}
