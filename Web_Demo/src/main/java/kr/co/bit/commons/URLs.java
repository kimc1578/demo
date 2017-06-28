package kr.co.bit.commons;


public class URLs {
	public static final String URI_MAIN = "../../";
	private static final String user_default = "/User";
	private static final String board_default = "/Board";
		
	public static final String URI_LOGOUT = "/logout";
	public static final String URI_LOGOUT_FULL = user_default + URI_LOGOUT;
	
	public static final String URI_LOGIN_CHK = "/login_chk";
	public static final String URI_LOGIN_CHK_FULL = user_default + URI_LOGIN_CHK;
	
	public static final String URI_ID_CHK = "/id_chk";
	public static final String URI_ID_CHK_FULL = user_default + URI_ID_CHK;
	
	public static final String URI_JOIN_VIEW = "/join_view";
	public static final String URI_JOIN_VIEW_FULL = user_default + URI_JOIN_VIEW;
	
	public static final String URI_JOIN = "/join";
	public static final String URI_JOIN_FULL = user_default + URI_JOIN;
	
	public static final String URI_BOARDLIST = "/boardList";
	public static final String URI_BOARDLIST_FULL = board_default + URI_BOARDLIST;
	
	public static final String URI_BOARDLIST_SEL = "/boardListSel";
	public static final String URI_BOARDLIST_SEL_FULL = board_default + URI_BOARDLIST_SEL;
	
	public static final String URI_BOARDCONTENTS = "/boardContents";
	public static final String URI_BOARDCONTENTS_FULL = board_default + URI_BOARDCONTENTS;
	
	public static final String URI_BOARDDELETE = "/boardDelete";
	public static final String URI_BOARDDELETE_FULL = board_default + URI_BOARDDELETE;
	
	public static final String URI_BOARDMODIFY_VIEW = "/boardModify_view";
	public static final String URI_BOARDMODIFY_VIEW_FULL = board_default + "/boardModify_view";
	
	public static final String URI_BOARDMODIFY = "/boardModify";
	public static final String URI_BOARDMODIFY_FULL = board_default + URI_BOARDMODIFY;
	
	public static final String URI_BOARDWRITE_VIEW = "/boardWrite_view";
	public static final String URI_BOARDWRITE_VIEW_FULL = board_default + URI_BOARDWRITE_VIEW;
	
	public static final String URI_BOARDWRITE = "/boardWrite";
	public static final String URI_BOARDWRITE_FULL = board_default + URI_BOARDWRITE;
	
	public static final String URI_BOARDSEARCH = "/boardSearch";
	public static final String URI_BOARDSEARCH_FULL = board_default + URI_BOARDSEARCH;
	
	public static final String URI_FILEDOWNLOAD = "/fileDownload";
	public static final String URI_FILEDOWNLOAD_FULL = board_default + URI_FILEDOWNLOAD;
	
}


