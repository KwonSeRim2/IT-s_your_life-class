package org.scoula.icecream.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.icecream.domain.IcecreamVO;
import org.scoula.icecream.dto.IcecreamDTO;
import org.scoula.icecream.mapper.IcecreamMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class IcecreamServiceImpl implements IcecreamService{
    final private IcecreamMapper mapper;

    @Override
    public List<IcecreamDTO> getList() {
        return mapper.getList().stream()
                .map(IcecreamDTO::of)
                .toList();
    }

    @Override
    public IcecreamDTO get(Long no) {
        log.info("get....."+no);
        IcecreamDTO board = IcecreamDTO.of(mapper.get(no));

        return Optional.ofNullable(board)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void create(IcecreamDTO board) {
        log.info("create......"+board);

        IcecreamVO vo = board.toVo();
        mapper.create(vo);
        board.setNo(vo.getNo());

    }

    @Override
    public boolean update(IcecreamDTO board) {
        return false;
    }

    @Override
    public boolean delete(Long no) {
        return false;
    }
}
