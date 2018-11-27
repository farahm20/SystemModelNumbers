public class SystemModelNumbers
{
    private Type UserType;
    private BackBoxColor UserColor;
    private LowerDome UserDome;
    
    public SystemModelNumbers(Type uType, BackBoxColor uColor, LowerDome uDome)
    {
        this.UserType = uType;
        this.UserColor = uColor;
        this.UserDome = uDome;
    }
    
    public Type getModelType()
    {
        return UserType;
    }
    
    public BackBoxColor getModelBoxColor()
    {
        return UserColor;
    }
    
    public LowerDome getModelDome()
    {
        return UserDome;
    }
    
    public String toString()
    {
        String display = String.format("Model Type: %s\nModel Boc Color: %s\nModel Dome: %s\n", UserType, UserColor, UserDome);
        return display;
    }
   
    public void MatchModelNumber(Type uType, BackBoxColor uColor, LowerDome uDome)
    {
        if(uType == Type.INCEILINGINDOOR)
        {
            if(uColor == BackBoxColor.WHITEWITHWHITETRIMRING)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-FW0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-FW1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
            }
            else
            {
                System.out.println("Please enter correct specification");
            }
            
        }
        else if(uType == Type.INCEILINGENVIRONMENTAL )
        {
            if(uColor == BackBoxColor.BLACKWITHBLACKTRIMRING)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-YB0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-YB1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
            }
            else
            {
                System.out.println("Please enter correct specification");
            }
        }
        else if(uType == Type.PENDANTSTANDARD)
        {
            if(uColor == BackBoxColor.GRAY)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-PG0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-PG1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
                
            }
            else if(uColor == BackBoxColor.BLACK)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-PB0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-PB1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
                
            }
            else
            {
                System.out.println("Please enter correct specification");
            }
        }
        else if(uType == Type.PENDANTENVIRONMENTAL)
        {
            if(uColor == BackBoxColor.GRAY)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-EG0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-EG1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
            }
            else
            {
                System.out.println("Please enter correct specification");
            }
        }
        else if(uType == Type.PENDANTENVIRONMENTALSTAINLESSSTEEL)
        {
            if(uColor == BackBoxColor.GRAY)
            {
                if(uDome == LowerDome.SMOKED)
                {
                    System.out.println("Model Number: S6220-ESG0");
                }
                else if(uDome == LowerDome.CLEAR)
                {
                    System.out.println("Model Number: S6220-ESG1");
                }
                else
                {
                    System.out.println("Please enter correct specification");
                }
            }
            else
            {
                System.out.println("Please enter correct specification");
            }
        }
        else
        {
            System.out.println("Sorry, not found. ");
        }
        
    }
}

/**
 * 

 * 
 */