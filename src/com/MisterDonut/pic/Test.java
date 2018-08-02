package com.MisterDonut.pic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String s : args){
			System.out.println(1+" "+s);
		}
		if(args.length == 2){
			FileClassify fc = new FileClassify(args[0],args[1]);
			fc.work();
		}
	}

}
