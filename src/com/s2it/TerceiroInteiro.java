package com.s2it;

public class TerceiroInteiro {
	
	 char[] a;
	 char[] b;
	 int maiorValor;
	 
   public Integer terceiroValor(final Integer a, final Integer b) {
   	
   	if(a == null || b == null)
   		return null;
   	
       this.a = a.toString().toCharArray();
       this.b = b.toString().toCharArray();
       StringBuilder repassar = new StringBuilder();
       
       if(this.a.length > this.b.length)
       {
       	this.maiorValor = this.a.length;
       }else{
       	this.maiorValor = this.a.length;
       }

       for (int x = 0; x < this.maiorValor; x++) {
           if (this.a.length > x) {
           	repassar.append(String.valueOf(this.a[x]));
           }
           if (this.b.length > x) {
           	repassar.append(String.valueOf(this.b[x]));
           }
       }

       Integer c = Integer.valueOf(repassar.toString());
       
       return c > 1000000 ? -1 : c;
   }

	public static void main(String[] args) {

		TerceiroInteiro t = new TerceiroInteiro();

		System.out.println(t.terceiroValor(1289, 5678));

	}

}
