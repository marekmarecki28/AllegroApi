package com.javahash.spring.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javahash.spring.utils.AllegroUtils;

@Controller
public class HelloWorldController { 
    
    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    public void showImage(HttpServletResponse response) throws Exception {

    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	AllegroUtils itemThumbnailUrls = new AllegroUtils();
    	ServletOutputStream responseOutputStream = null;
    	
    	for (String itemThumbnailUrl : itemThumbnailUrls.getItemThumbnailUrl())
    	{
    		System.out.println("Loop");
    		InputStream is = null;
        	try {
        	  URL url = new URL(itemThumbnailUrl);
        	  is = url.openStream ();
        	  byte[] byteChunk = new byte[4096]; // Or whatever size you want to read in at a time.
        	  int n;

        	  while ( (n = is.read(byteChunk)) > 0 ) {
        	    baos.write(byteChunk, 0, n);
        	  }
        	}
        	catch (IOException e) {
        	  e.printStackTrace ();
        	}
        	finally {
        	  if (is != null) { is.close(); }
        	}
        	
        	byte[] imgByte = baos.toByteArray();

            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");
            responseOutputStream = response.getOutputStream();
            responseOutputStream.write(imgByte);
            responseOutputStream.flush();
            responseOutputStream.close();
    	}

    }
    
    @RequestMapping(value = "/mySellItems", method = RequestMethod.GET)
    public void mySellItems(HttpServletResponse response) throws Exception {

    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	AllegroUtils itemThumbnailUrls = new AllegroUtils();
    	ServletOutputStream responseOutputStream = null;
    	
    	for (String itemThumbnailUrl : itemThumbnailUrls.getMySellingThumbnailsUrls())
    	{
    		System.out.println("Loop");
    		InputStream is = null;
        	try {
        	  URL url = new URL(itemThumbnailUrl);
        	  is = url.openStream ();
        	  byte[] byteChunk = new byte[4096]; // Or whatever size you want to read in at a time.
        	  int n;

        	  while ( (n = is.read(byteChunk)) > 0 ) {
        	    baos.write(byteChunk, 0, n);
        	  }
        	}
        	catch (IOException e) {
        	  e.printStackTrace ();
        	}
        	finally {
        	  if (is != null) { is.close(); }
        	}
        	
        	byte[] imgByte = baos.toByteArray();

            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");
            responseOutputStream = response.getOutputStream();
            responseOutputStream.write(imgByte);
            responseOutputStream.flush();
            responseOutputStream.close();
    	}

    }
}
