package com.spring.di;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {

    // setChef()를 컴파일 시 생성하고 setChef()에 @Autowired 어노테이션을 추가시킴
    @Setter(onMethod_ = @Autowired)
    private Chef chef;
}
