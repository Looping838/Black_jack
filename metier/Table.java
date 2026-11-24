package metier;

public class Table 
{
    Personne   croupier   ;
    Joueur     joueur     ;
    
    Pioche     pioche     ;
    Personne[] ensJoueurs ;
    int        nbJoueur   ;

    public Table ()
    {
        this.croupier = new Personne( "Croupier" ) ;
        this.pioche   = new Pioche()   ;

        this.ensJoueurs = new Personne[4] ;
        this.nbJoueur   = 0 ;

        this.joueur = new Joueur() ;
        this.ajouterJoueur( this.joueur ) ;
    }

    public Personne getCroupier () { return this.croupier ; }
    public Joueur   getJoueur   () { return this.joueur   ; }
    public Pioche   getPioche   () { return this.pioche   ; }

    public void     ajouterJoueur ( Joueur j ) 
    { 
        this.ensJoueurs[nbJoueur] = j ;
        this.nbJoueur ++ ;
    }

    public void distribuer ()
    {
        for ( int cpt = 0 ; cpt < this.nbJoueur ; cpt ++ )
            this.ensJoueurs[cpt].ajouterCarte(this.pioche.depiler());

        this.croupier.ajouterCarte(this.pioche.depiler());
    }
}
