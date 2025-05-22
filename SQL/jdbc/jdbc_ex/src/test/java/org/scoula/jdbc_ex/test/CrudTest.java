package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CrudTest {
    Connection conn = JDBCUtil.getConnection();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }


    @Test
    @DisplayName("새로운 user를 등록한다.")
    @Order(1)
    public void insertUser() throws SQLException {
        String sql = "insert into users(id, password, name, role) values(?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            //sql 쿼리의 매개변소 설정
            pstmt.setString(1, "scoula");
            pstmt.setString(2, "scoula3");
            pstmt.setString(3, "스콜라");
            pstmt.setString(4, "USER");
            //sql 쿼리 실행 및 삽입된 행의 수를 반환
            int count = pstmt.executeUpdate();
            //삽입된 행의 수가 1인지 확인하느 테스트
            Assertions.assertEquals(1, count);
        }
    }

    @Test
    @DisplayName("user 목록을추출한다.")

    @Order(2)
    public void selectUser() throws SQLException {
        // 모든 사용자 정보 조회
        String sql = "select * from users";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {
            //결과 집합 resultSet에서 읽어와서 출력
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }
    }

    @Test
    @DisplayName("특정 user 검색한다.")
    @Order(3)
    public void selectUserById() throws SQLException {
        String userid = "scoula";
        //특정 사용자 조회
        String sql ="select * from users where id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, userid);
            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    System.out.println(rs.getString("name"));
                } else { //사용자가 존재하지 않으면 예외 발생
                    throw new SQLException("scoula not found");
                }
            }
        }
    }


    @Test
    @DisplayName("특정 user 수정한다.")
    @Order(4)
    //특정 사용자 정보 수정
    public void updateUser() throws SQLException {
        String userid = "scoula";
        String sql = "update users set name= ? where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "스콜라 수정");
            stmt.setString(2, userid);
            int count = stmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    @Test
    @DisplayName("지정한 사용자를 삭제한다.")
    @Order(5)
    public void deleteUser() throws SQLException {
        String userid = "scoula";
        String sql = "delete from users where id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userid);
            int count = stmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

}
