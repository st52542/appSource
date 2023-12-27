package fei.upce.appsource.repository;

import fei.upce.appsource.Entity.SourceData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SourceDataRepository extends JpaRepository<SourceData,Long> {
    List<SourceData> findAll();
}
