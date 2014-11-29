package info.hieudt.scraper.fpts.domain;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ThongKeGia {
    @EmbeddedId
    private ThongKeGiaId pk = new ThongKeGiaId();

    @Embedded
    private Gia gia;

    @Embedded
    private KhoiLuongGiaoDich khoiLuongGiaoDich;

    @Embedded
    private GiaTriGiaoDich giaTriGiaoDich;

    public ThongKeGia() {
    }

    public ThongKeGia(ThongKeGiaId pk, Gia gia, KhoiLuongGiaoDich khoiLuongGiaoDich, GiaTriGiaoDich giaTriGiaoDich) {
        this.pk = pk;
        this.gia = gia;
        this.khoiLuongGiaoDich = khoiLuongGiaoDich;
        this.giaTriGiaoDich = giaTriGiaoDich;
    }

    public ThongKeGiaId getPk() {
        return pk;
    }

    public void setPk(ThongKeGiaId pk) {
        this.pk = pk;
    }

    public Gia getGia() {
        return gia;
    }

    public void setGia(Gia gia) {
        this.gia = gia;
    }

    public KhoiLuongGiaoDich getKhoiLuongGiaoDich() {
        return khoiLuongGiaoDich;
    }

    public void setKhoiLuongGiaoDich(KhoiLuongGiaoDich khoiLuongGiaoDich) {
        this.khoiLuongGiaoDich = khoiLuongGiaoDich;
    }

    public GiaTriGiaoDich getGiaTriGiaoDich() {
        return giaTriGiaoDich;
    }

    public void setGiaTriGiaoDich(GiaTriGiaoDich giaTriGiaoDich) {
        this.giaTriGiaoDich = giaTriGiaoDich;
    }
}
