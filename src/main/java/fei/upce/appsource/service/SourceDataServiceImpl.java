package fei.upce.appsource.service;

import fei.upce.appsource.entity.SourceData;
import fei.upce.appsource.repository.SourceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class SourceDataServiceImpl implements SourceDataService{

    @Autowired
    SourceDataRepository sourceDataRepository;

    public SourceDataServiceImpl(SourceDataRepository sourceDataRepository) {
        this.sourceDataRepository = sourceDataRepository;
    }
    @Override
    public List<Optional<SourceData>> getSourceData() {
        List<SourceData> sourceDataList = sourceDataRepository.findAll();
        return sourceDataList.stream()
                .map(Optional::ofNullable)
                .collect(Collectors.toList());
    }
}
