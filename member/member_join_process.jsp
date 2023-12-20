<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost/ggouppang_학번";
        String dbUser = "root";
        String dbPassword = "123123";

        conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

        String ID = request.getParameter("ID");
        String Password = request.getParameter("Password");
        String Name = request.getParameter("Name");
        String Gender = request.getParameter("Gender");
        String Birth = request.getParameter("Birth");
        String Email = request.getParameter("Email");
        String Phone = request.getParameter("Phone");
        String Address = request.getParameter("Address");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String regist_day = sdf.format(new java.util.Date());

        String insertQuery = "INSERT INTO member (ID, Password, Name, Gender, Birth, Email, Phone, Address, regist_day) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
  pstmt.setString(1, request.getParameter("ID"));
pstmt.setString(2, request.getParameter("Password"));
pstmt.setString(3, request.getParameter("Name"));
pstmt.setString(4, request.getParameter("Gender"));
pstmt.setString(5, request.getParameter("Birth"));
pstmt.setString(6, request.getParameter("Email"));
pstmt.setString(7, request.getParameter("Phone"));
pstmt.setString(8, request.getParameter("Address"));
pstmt.setString(9, regist_day);


        int result = pstmt.executeUpdate();

        if (result > 0) {
            response.sendRedirect("../index.jsp");
        } else {
            out.println("<div class='alert alert-danger'>");
            out.println("회원가입에 실패했습니다. 다시 시도해주세요.");
            out.println("</div>");
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        out.println("<div class='alert alert-danger'>");
        out.println("데이터베이스 연결 오류: " + e.getMessage());
        out.println("</div>");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
