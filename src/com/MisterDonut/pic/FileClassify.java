package com.MisterDonut.pic;

import java.io.File;

public class FileClassify {

	private File file = null;
	private String type = null;
	private File[] fileList = null;
	private File aimFile = null;
	
	public FileClassify(String path,String type) {
		this.file = new File(path);
		this.type = type;
		
		this.aimFile = new File(path+"/"+this.type);
	}

	public void work() {
		
		if(!this.aimFile.exists()){
			this.aimFile.mkdirs();
		}
		
		this.fileList = file.listFiles();
		for(int i = 0;i<fileList.length;i++){
			if(fileList[i].getName().contains(type)){
				File aim = new File(this.aimFile.getAbsolutePath()+"/"+fileList[i].getName());
				fileList[i].renameTo(aim);
				System.out.println(fileList[i]);
			}
		
			
		}
		
	}

}
