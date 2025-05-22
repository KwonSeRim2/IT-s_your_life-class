package org.scoula.travel;

import com.opencsv.bean.CsvToBeanBuilder;
import org.scoula.travel.domain.TravelVO;

import java.io.FileReader;
import java.util.List;

public class CSVTest2 {
    public static void main(String[] args)throws Exception {
        //csv파일을 travelVo리스트로 매핑
        //csv파일 헤더명과 travelVO 필등명이 일치해야 한다.
        List<TravelVO> travels = new CsvToBeanBuilder<TravelVO>(new FileReader("travel.csv"))
                .withType(TravelVO.class)
                .build()
                .parse();

        travels.forEach(travel -> {
//            System.out.println(travel);

            travels.forEach(System.out::println);//메소드 참조
        });
    }
}
