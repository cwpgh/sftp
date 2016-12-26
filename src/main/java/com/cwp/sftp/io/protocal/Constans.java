package com.cwp.sftp.io.protocal;

public interface Constans {

	byte SSH_FXP_INIT = 1;
	byte SSH_FXP_VERSION = 2;
	byte SSH_FXP_OPEN = 3;
	byte SSH_FXP_CLOSE = 4;
	byte SSH_FXP_READ = 5;
	byte SSH_FXP_WRITE = 6;
	byte SSH_FXP_LSTAT = 7;
	byte SSH_FXP_FSTAT = 8;
	byte SSH_FXP_SETSTAT = 9;
	byte SSH_FXP_FSETSTAT = 10;
	byte SSH_FXP_OPENDIR = 11;
	byte SSH_FXP_READDIR = 12;
	byte SSH_FXP_REMOVE = 13;
	byte SSH_FXP_MKDIR = 14;
	byte SSH_FXP_RMDIR = 15;
	byte SSH_FXP_REALPATH = 16;
	byte SSH_FXP_STAT = 17;
	byte SSH_FXP_RENAME = 18;
	byte SSH_FXP_READLINK = 19;
	byte SSH_FXP_SYMLINK = 20;
	byte SSH_FXP_LINK = 21;
	byte SSH_FXP_BLOCK = 22;
	byte SSH_FXP_UNBLOCK = 23;

	byte SSH_FXP_STATUS = 101;
	byte SSH_FXP_HANDLE = 102;
	byte SSH_FXP_DATA = 103;
	byte SSH_FXP_NAME = 104;
	byte SSH_FXP_ATTRS = 105;
	byte SSH_FXP_EXTENDED = (byte) 200;//
	byte SSH_FXP_EXTENDED_REPLY = (byte) 201;
	
	int SSH_FXF_READ = 1;
	int SSH_FXF_WRITE = 2;
	int SSH_FXF_APPEND = 4;
	int SSH_FXF_CREAT = 8;
	int SSH_FXF_TRUNC = 16;
	int SSH_FXF_EXCL = 32;
	int SSH_FILEXFER_ATTR_SIZE = 1;
	int SSH_FILEXFER_ATTR_UIDGID = 2;
	int SSH_FILEXFER_ATTR_PERMISSIONS = 4;
	int SSH_FILEXFER_ATTR_ACMODTIME = 8;
	int SSH_FILEXFER_ATTR_EXTENDED = Integer.MIN_VALUE;
	public static final int SSH_FX_OK = 0;
	public static final int SSH_FX_EOF = 1;
	public static final int SSH_FX_NO_SUCH_FILE = 2;
	public static final int SSH_FX_PERMISSION_DENIED = 3;
	public static final int SSH_FX_FAILURE = 4;
	public static final int SSH_FX_BAD_MESSAGE = 5;
	public static final int SSH_FX_NO_CONNECTION = 6;
	public static final int SSH_FX_CONNECTION_LOST = 7;
	public static final int SSH_FX_OP_UNSUPPORTED = 8;
	int MAX_MSG_LENGTH = 262144;
	public static final int OVERWRITE = 0;
	public static final int RESUME = 1;
	public static final int APPEND = 2;

}
