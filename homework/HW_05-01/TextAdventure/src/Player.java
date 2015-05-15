/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class Player extends Character
{
    private int wallet;


    public Player(String name)
    {
        this.characterName = name;
        wallet = 5000;
    }

    public void addToWallet(int num)
    {
        if(wallet + num >= 99999)
        {
            wallet = 99999;
        }
        else
        {
            wallet = + num;
        }
    }


    public void subtractFromWallet(int num)
    {
        if(wallet - num <= 0)
        {
            wallet = 0;
        }
        else
        {
            wallet = - num;
        }
    }

    public int getWalletFunds()
    {
        return wallet;
    }

    @Override
    public void setCharacterName(String name)
    {
        this.characterName = name;
    }

    @Override
    public String getCharacterName()
    {
        return this.characterName;
    }

    @Override
    public void setHealthPoints(int num)
    {
        this.healthPoints = num;
    }

    @Override
    public int getHealthPoints()
    {
        return this.healthPoints;
    }
}
