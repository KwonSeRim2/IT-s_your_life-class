package org.scoula.icecream.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.icecream.domain.IcecreamVO;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IcecreamDTO {
    private Long no;
    private String name;
    private String flavor;
    private int price;
    private Date reg_date;

    public static IcecreamDTO of(IcecreamVO vo){
        return vo == null ? null : IcecreamDTO.builder()
                .no(vo.getNo())
                .name(vo.getName())
                .flavor(vo.getFlavor())
                .price(vo.getPrice())
                .reg_date(vo.getReg_date())
                .build();
    }

    //dro->vo
    public IcecreamVO toVo(){
        return IcecreamVO.builder()
                .no(no)
                .name(name)
                .flavor(flavor)
                .price(price)
                .reg_date(reg_date)
                .build();
    }
}
