


public class SMNDemo
{
    public static void main(String [] args)
    {
        SystemModelNumbers smnUser = new SystemModelNumbers(Type.INCEILINGINDOOR, BackBoxColor.WHITEWITHWHITETRIMRING, LowerDome.SMOKED );
        
        smnUser.MatchModelNumber(Type.PENDANTSTANDARD, BackBoxColor.GRAY, LowerDome.SMOKED);
        smnUser.MatchModelNumber(Type.PENDANTENVIRONMENTALSTAINLESSSTEEL, BackBoxColor.GRAY, LowerDome.CLEAR);
        smnUser.MatchModelNumber(Type.INCEILINGENVIRONMENTAL, BackBoxColor.GRAY, LowerDome.SMOKED);
        
        
    }
}