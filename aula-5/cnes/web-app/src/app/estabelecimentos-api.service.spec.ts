import { TestBed } from '@angular/core/testing';

import { EstabelecimentosApiService } from './estabelecimentos-api.service';

describe('EstabelecimentosApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EstabelecimentosApiService = TestBed.get(EstabelecimentosApiService);
    expect(service).toBeTruthy();
  });
});
