package kr.co.bit.commons;

public class Pages {
	
	private static final String default_path = "/View";
	private static final String user_path = "/User";
	private static final String board_path = "/Board";
	
	public static final String VIEW_MAIN = default_path + "/Main.jsp";
	public static final String VIEW_USER_JOIN = default_path + user_path + "/Join.jsp";
	public static final String VIEW_USER_JOIN_FAILED = default_path + user_path + "/JoinFailed.jsp";
	public static final String VIEW_USER_LOGIN = default_path + user_path + "/Login.jsp";
	public static final String VIEW_USER_MENU = default_path + user_path + "/Menu.jsp";
	public static final String VIEW_USER_BOARDLIST = default_path + board_path + "/BoardList.jsp";
	public static final String VIEW_BOARD_CONTENTS = default_path + board_path + "/BoardContents.jsp";
	public static final String VIEW_BOARD_MODIFY = default_path + board_path + "/BoardModify.jsp";
	public static final String VIEW_BOARD_WRITE = default_path + board_path + "/BoardWrite.jsp";
	
	
}
