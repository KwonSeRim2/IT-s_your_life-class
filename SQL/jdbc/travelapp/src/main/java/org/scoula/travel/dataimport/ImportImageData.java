package org.scoula.travel.dataimport;

import com.opencsv.bean.CsvToBeanBuilder;
import org.scoula.database.JDBCUtil;
import org.scoula.travel.dao.TravelDao;
import org.scoula.travel.dao.TravelDaoImpl;
import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

import java.io.File;
import java.io.FileReader;
import java.util.List;

public class ImportImageData {
    public static void main(String[] args) {
        TravelDao dao = new TravelDaoImpl();

        File dir = new File("travel-image");
        File[] files = dir.listFiles(); //폴더 내 파일 리스트로 

        if (files == null) {
            System.err.println("디렉토리를 읽을 수 없거나 존재하지 않습니다: " + dir.getAbsolutePath());
            return;
        }

        for (File file : files) {
            String filename = file.getName();
            long travelNo = Long.parseLong(filename.split("-")[0]);

            TravelImageVO image = TravelImageVO.builder()
                    .filename(filename)
                    .travelNo(travelNo)
                    .build();

            System.out.println(image);
            dao.insertImage(image);
        }


        JDBCUtil.close();
    }
}
