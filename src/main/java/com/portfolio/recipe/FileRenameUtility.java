package com.portfolio.recipe;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class FileRenameUtility {
public static void main(String[] a) {
    System.out.println("FileRenameUtility");
    FileRenameUtility renameUtility = new FileRenameUtility();
//    renameUtility.fileRename("C:/Users/Michael/Downloads/recipeAssets");
    
//	img String must be spliced here to only save the actual image file for example -> 06db8d725ac25ed4a7fa4bebeaeee2bb.jpg
    String img;
    String originalFile = "https://edamam-product-images.s3.amazonaws.com/web-img/0c5/0c5ba5e925e8de4a16deaa1864cb1812.jpg?"
    		+ "X-Amz-Security-Token=IQoJb3JpZ2luX2VjEM3%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBBjFtOiv9AsptQx"
    		+ "PoxkTaCglo6xMSxXjCtz0tJTWiTDAiAfVo2JNh63w82LffJxN4ejVM9vlaQqSXTUuoSL4FJr6Sr6Awh2EAAaDDE4NzAxNzE1MDk4NiIM3B"
    		+ "cx8hYxLsB%2BdGdcKtcDnxta%2BbJxACQ7Ro1uVnjs%2FCn8Jky0qFb3VYLN%2BWIizPPLSqeEUAWxNIx4qq%2F29QGXwBsZ9Lq6mo7yU4"
    		+ "Nuga%2Btol1szkKpGQqu27F32B1VFANbtVUzBBEsHBRE6zXxtyxMErucYr95uxfE99LQehXMFoNyk0T%2Fv";
    
    String regex = ".*\\/(.*)\\?";
    
    Pattern pattern = Pattern.compile(regex);
//    this is the working way to extract the image name out of the original image link
    img = originalFile.substring(originalFile.lastIndexOf("/")+1,originalFile.lastIndexOf("?"));
    System.out.println(img);
    String[] result = pattern.split(originalFile);
    for (String data: result) {
        System.out.println(data);
    }
}
// renames files that start with a certain string, then replaces a section of the file name with a given string
// to use this effectively we would need all the images downloaded beforehand and then a (imageName,recipeId) map 
// using the map, rename all images to their respective recipeid

//next step
//download all recipe images right after posting them all on a web page, might have to paginate the recipes
// retreive the recipeid of every ecipe in the json files, query the recipe database and then post the images to the website, download those images with the extension
private void fileRename(String folder){
    File file = new File(folder);
    System.out.println("Reading: "+file.toString());
    if(file.isDirectory()){
        File[] files = file.listFiles();
        List<File> filelist = Arrays.asList(files);
        filelist.forEach(f->{
        	System.out.println(f.toString());
           if(!f.isDirectory() && f.getName().startsWith("newName")){
               System.out.println(f.getName());
               String newName = f.getAbsolutePath().replace("e42f911","newName");
               boolean isRenamed = f.renameTo(new File(newName));
               if(isRenamed)
                   System.out.println(String.format("Renamed this file %s to  %s",f.getName(),newName));
               else
                   System.out.println(String.format("%s file is not renamed to %s",f.getName(),newName));
           }
        });

    	}
	}
}