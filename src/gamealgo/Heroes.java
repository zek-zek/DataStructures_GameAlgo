package gamealgo;
public class Heroes
{
    private String heroName = "";    
    private String heroTalk = "";
    private String ability[] = new String[3];
    private int healthPoints = 0;
    private int damage[] = new int[3];
    
    void heroTalk()
    {
        System.out.println(this.heroTalk);
    }
    
    void useAbility(int abilityNumber, int abilityDamage, Heroes opponent)
    {
        System.out.println(" used " + this.ability [0]);
        opponent.healthPoints -= abilityDamage;
    }
    
    void evaluateHP(Heroes user, Heroes opponent)
    {
        if(user.healthPoints == 0)
        {
            
        }
        else if(opponent.healthPoints == 0)
        {
            
        }
    }
}
