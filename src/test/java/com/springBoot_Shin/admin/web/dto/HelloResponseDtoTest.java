package com.springBoot_Shin.admin.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        String name ="test";
        int amout=1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amout);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amout);
    }
}
