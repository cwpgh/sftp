package com.cwp.jsch.demo;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
 
public class Demo3 {
 
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        JSch jsch = new JSch();
        
        Session session = jsch.getSession("root", "112.74.18.249",33775);
        session.setPassword("kaka4!@#");
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        
        ChannelSftp channelSftp = (ChannelSftp)session.openChannel("sftp");
        channelSftp.connect();
        channelSftp.setFilenameEncoding("utf-8");
        
        Vector vector  = channelSftp.ls("/");
        try{
            for(Object obj :vector){
                if(obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry){
                    String fileName = ((com.jcraft.jsch.ChannelSftp.LsEntry)obj).getFilename();
                    System.out.println(fileName);
                }
            }
        }
        finally{
            channelSftp.quit();
            session.disconnect();
        }
    }
 
}  
