package VizeHazirlik.TekYonluBagliListe.ornek1;

public class bagliListe {

        Eleman bas;

        public bagliListe() {
            this.bas = null;
        }

        public void basaEkle(int veri) {
            Eleman yeniEleman = new Eleman(veri);
            yeniEleman.sonraki = bas;
            bas = yeniEleman;
        }

        public void sonaEkle(int veri) {
            Eleman yeniEleman = new Eleman(veri);
            if (bas == null) {
                bas = yeniEleman;
                return;
            }

            Eleman mevcut = bas;
            while (mevcut.sonraki != null) {
                mevcut = mevcut.sonraki;
            }
            mevcut.sonraki = yeniEleman;
        }

        public void arayaEkle(int veri, int konum) {
            Eleman yeniEleman = new Eleman(veri);
            Eleman onceki = null;
            Eleman mevcut = bas;
            int sayac = 0;

            while (sayac < konum) {
                onceki = mevcut;
                mevcut = mevcut.sonraki;
                if (mevcut == null) {
                    System.out.println("Belirtilen konum bulunamadı!");
                    return;
                }
                sayac++;
            }

            onceki.sonraki = yeniEleman;
            yeniEleman.sonraki = mevcut;
        }

        public void bastanSil() {
            if (bas != null) {
                Eleman gecici = bas;
                bas = bas.sonraki;
                gecici.sonraki = null;
            } else {
                System.out.println("Liste boş!");
            }
        }

        public void sondanSil() {
            if (bas == null || bas.sonraki == null) {
                bas = null;
            } else {
                Eleman onceki = null;
                Eleman mevcut = bas;
                while (mevcut.sonraki != null) {
                    onceki = mevcut;
                    mevcut = mevcut.sonraki;
                }
                onceki.sonraki = null;
            }
        }

        public void yazdir() {
            Eleman mevcut = bas;
            while (mevcut != null) {
                System.out.print(mevcut.veri + "-->");
                mevcut = mevcut.sonraki;
            }
            System.out.println();
        }
    }


