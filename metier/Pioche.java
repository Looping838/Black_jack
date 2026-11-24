package metier;

public class Pioche 
{
    Carte[] pioche      ;
    int     comptPioche ;

    public Pioche()
    {
        this.pioche      = new Carte[52] ;
        this.comptPioche = 0             ;

        this.initialiserPioche();
    }

    public Carte[] getPioche (                ) { return this.pioche          ; }
    public void    setPioche ( Carte[] pioche ) {        this.pioche = pioche ; }

    public void  empiler ( Carte c) 
    {
        this.pioche[comptPioche] = c ;
        this.comptPioche++ ;
    }
    public Carte depiler () 
    {
        if ( this.comptPioche == 0 ) { return null ; }
        this.comptPioche -- ;
        Carte c = this.pioche[comptPioche] ;
                  
        return c ;
    }

    public void creerPioche ()
    {
        String[] tmpCouleur = {"Coeur", "Carreau", "Pique", "Trefle"}
        String[] tmpValeur  = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi"} ;

        for ( String couleur : tmpCouleur )
        {
            for ( String valeur : tmpValeur )
            {
                this.empiler(new Carte(couleur, valeur));
            }
        }
    }

    public void melanger () 
    {
        for ( int cpt = 0 ; cpt < this.pioche.length - 1 ; cpt++ )
        {
            int   rnd = (int)   ( Math.random() * 52 ) ;
            Carte tmp = new Carte ( this.pioche[rnd] ) ;

            this.pioche[rnd] = this.pioche[cpt] ;
            this.pioche[cpt] = tmp ;
        }
    }

    public void initialiserPioche () 
    {
        this.creerPioche();
        this.melanger   ();
    }
}
