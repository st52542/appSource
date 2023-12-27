package fei.upce.appsource.service;

import fei.upce.appsource.Entity.SourceData;

import java.util.List;
import java.util.Optional;

public interface SourceDataService {
    List<Optional<SourceData>> getSourceData();
}
