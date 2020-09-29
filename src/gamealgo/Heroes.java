package gamealgo;
public class Heroes
{
    private String heroName = "";    
    private String heroTalk = "";
    private String ability[] = new String[3];
    private int healthPoints = 0;
    private int damage[] = new int[4];
    
    void heroTalk()
    {
        System.out.println(this.heroTalk);
    }
    
    void useAbility(int abilityNumber)
    {
        System.out.println(" used " + this.ability [0]);
    }
}
