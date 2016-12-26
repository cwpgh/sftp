package com.cwp.sftp.io.protocal;

public interface Constans {

	char SSH_FXP_INIT                =1;

	char SSH_FXP_VERSION             =2;

	char SSH_FXP_OPEN                =3;

	char SSH_FXP_CLOSE               =4;

	char SSH_FXP_READ               =5;

	char SSH_FXP_WRITE               =6;

	char SSH_FXP_LSTAT               =7;

	char SSH_FXP_FSTAT               =8;

	char SSH_FXP_SETSTAT             =9;

	char SSH_FXP_FSETSTAT           =10;

	char SSH_FXP_OPENDIR           =11;

	char SSH_FXP_READDIR            =12;

	char SSH_FXP_REMOVE             =13;

	char SSH_FXP_MKDIR             =14;

	char SSH_FXP_RMDIR              =15;

	char SSH_FXP_REALPATH           =16;

	char SSH_FXP_STAT              =17;

	char SSH_FXP_RENAME             =18;

	char SSH_FXP_READLINK           =19;

	char SSH_FXP_LINK               =21;

	char SSH_FXP_BLOCK             =22;

	char SSH_FXP_UNBLOCK            =23;

	 

	char SSH_FXP_STATUS           = 101;

	char SSH_FXP_HANDLE            =102;

	char SSH_FXP_DATA             = 103;

	char SSH_FXP_NAME             = 104;

	char SSH_FXP_ATTRS            = 105;

	 

	char SSH_FXP_EXTENDED         = 200;

	char SSH_FXP_EXTENDED_REPLY   = 201;


}
