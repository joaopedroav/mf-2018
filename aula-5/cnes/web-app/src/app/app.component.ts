import { Component, OnInit } from '@angular/core';
import { EstabelecimentosApiService } from './estabelecimentos-api.service';

@Component({
  selector: 'my-app',
  styleUrls: ['app.component.scss'],
  templateUrl: 'app.component.html'
})
export class AppComponent implements OnInit {

  estabelecimentos = [];
  pageSize = 10;
  lastPage;
  paginationEnabled = false;
  selectedRows: any[];
  zoom = 4;
  latBr = -15.615861;
  lngBr = -49.955067;

  constructor(private service: EstabelecimentosApiService) { }

  ngOnInit() {
    this.loadEstabelecimentos();
    this.paginationEnabled = true;
  }

  toggle() {
    this.paginationEnabled = !this.paginationEnabled;
  }

  loadEstabelecimentos() {
    this.service.getEstabelecimentos().subscribe(data => {
      this.estabelecimentos = data;
    });
  }
}
