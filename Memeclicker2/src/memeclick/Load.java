package memeclick;

public class Load {

	private int memes;
	private int memesperclick;
	private int memespersec;
	private int[][] upgrades;
	private int [][] prices;
	private int [][] amount = new int [2][9];
	
	public Load()
	{
		memes=0;
		upgrades = new int[2][9];
		memespersec = 0;
		memesperclick = 1;
		for(int x=0;x<9;x++)
		{
			for(int y=0;y<9;y++)
			{
				upgrades[x][y]=0;
			}
		}
		prices = new int[2][9];
		prices[0][0] = 20;
		prices[0][1] = 2500;
		prices[0][2] = 12500;
		prices[0][3] = 25000;
		prices[0][4] = 250000;
		prices[0][5]=  1250000;
		prices[0][6] = 25000000;
		prices[0][7] = 125000000;
		prices[0][8] = 1250000000;
		prices[1][0] = 200;
		prices[1][1] = 25000;
		prices[1][2] = 125000;
		prices[1][3] = 250000;
		prices[1][4] = 2500000;
		prices[1][5]=  12500000;
		prices[1][6] = 250000000;
		prices[1][7] = 1250000000;
		prices[1][8] = 2000000000;
	}

	public Load(int a, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o ,int p,int q, int r, int s, int t, int u)
	{
		memes=a;
		memespersec = d*5 +
		upgrades = new int[2][9];
		upgrades[0][0]=d;
		upgrades[0][1]=e;
		upgrades[0][2]=f;
		upgrades[0][3]=g;
		upgrades[0][4]=h;
		upgrades[0][5]=i;
		upgrades[0][6]=j;
		upgrades[0][7]=k;
		upgrades[0][8]=l;
		upgrades[1][0]=m;
		upgrades[1][1]=n;
		upgrades[1][2]=o;
		upgrades[1][3]=p;
		upgrades[1][4]=q;
		upgrades[1][5]=r;
		upgrades[1][6]=s;
		upgrades[1][7]=t;
		upgrades[1][8]=u;
		prices[0][0] = (int) (1*Math.pow(1.1, d));
		prices[0][1] = (int) (2*Math.pow(1.1, e));
		prices[0][2] = (int) (3*Math.pow(1.1, f));
		prices[0][3] = (int) (4*Math.pow(1.1, g));
		prices[0][4] = (int) (5*Math.pow(1.1, h));
		prices[0][5]=  (int) (6*Math.pow(1.1, i));
		prices[0][6] = (int) (7*Math.pow(1.1, j));
		prices[0][7] = (int) (8*Math.pow(1.1, k));
		prices[0][8] = (int) (9*Math.pow(1.1, l));
		prices[1][0] = (int) (1*Math.pow(1.1, m));
		prices[1][1] = (int) (2*Math.pow(1.1, n));
		prices[1][2] = (int) (3*Math.pow(1.1, o));
		prices[1][3] = (int) (4*Math.pow(1.1, p));
		prices[1][4] = (int) (5*Math.pow(1.1, q));
		prices[1][5]=  (int) (6*Math.pow(1.1, r));
		prices[1][6] = (int) (7*Math.pow(1.1, s));
		prices[1][7] = (int) (8*Math.pow(1.1, t));
		//prices[1][8] = (int) (9*Math.pow(1.1, u));
	}
	
	public void addpassive(int x)
	{
		if(this.memes<this.prices[0][x])
		{
			return;
		}
		this.upgrades[0][x]++;
		
				
	}
	
	public int nextprice(int y)
	{
		
	}
	
	public int getprice(int x,int y)
	{
		return price[x][y];
			
	}
	

}
