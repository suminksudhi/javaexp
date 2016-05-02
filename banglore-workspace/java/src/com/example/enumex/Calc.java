package com.example.enumex;

public enum Calc { 
	
	SUM{
		
		public int calculate(int a,int b){
			return a+b;

		}
		
		public String info(){
			return "I am international SUM!";

		}
		
	},
	DIFF{
		public int calculate(int a,int b){
			return a-b;
			
		}

	},
	MULTIPLY{
		public int calculate(int a,int b){
			return a*b;
		}

	},
	DIVIDE{
		public int calculate(int a,int b){
			return a/b;
		}

	};
	
	public abstract int calculate(int a,int b); 

}