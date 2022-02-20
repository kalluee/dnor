package com.example.dnor.domain;

import com.example.dnor.service.NameResponce;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface NameMapper {
    Name nameDtoToName(NameDto nameDto);

    NameDto nameToNameDto(Name name);

//    List<NameResponce> namesToNameDtos(List<NameDto> nameDto);

    List<NameResponce> namesToNameDtos(List<Name> allNames);
}
