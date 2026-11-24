package metier;

public class Joueur extends Personne
{
    int     monais ; 
    
    public Joueur ()
    {
        super("looping");
        this.monais = 1000 ;
    }

    public int  getMonais ()             { return this.monais ; }
    public void setMonais ( int monais ) { this.monais = monais ; }

    public boolean miser ( int nbr )
    {
        if ( nbr <= 0          ) return false ;
        if ( nbr > this.monais ) return false ;
        return true ;
    }
}
