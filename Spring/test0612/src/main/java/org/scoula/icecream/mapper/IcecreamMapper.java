package org.scoula.icecream.mapper;

import org.scoula.icecream.domain.IcecreamVO;

import java.util.List;

public interface IcecreamMapper {

    public List<IcecreamVO> getList();

    public IcecreamVO get(Long no);

    public void create(IcecreamVO vo);

//    public int update(IcecreamVO vo);
//
//    public int delete(Long no);
}
