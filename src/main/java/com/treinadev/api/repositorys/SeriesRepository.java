package com.treinadev.api.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.treinadev.api.models.SeriesModel;

@Repository
public interface SeriesRepository extends CrudRepository<SeriesModel, Long> {
    
}
