

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayListeUI {
	public static void main(String[] args) {
		MusiqueImpl musique1 = new MusiqueImpl("tit1", "aut1", "interprete1", "genre1");
		MusiqueImpl musique2 = new MusiqueImpl("tit2", "aut2", "interprete2", "genre2");
		MusiqueImpl musique3 = new MusiqueImpl("tit3", "aut3", "interprete3", "genre3");
		MusiqueImpl musique4 = new MusiqueImpl("tit4", "aut4", "interprete4", "genre4");
		MusiqueImpl musique5 = new MusiqueImpl("tit5", "aut5", "interprete5", "genre5");
		MusiqueImpl musique6 = new MusiqueImpl("tit6", "aut6", "interprete6", "genre6");
		ArrayList<MusiqueImpl> array = null;
		PlayListeImpl playListe = new PlayListeImpl("nom1", "genre1", 6, array);
		System.out.println(playListe.ajouterMusique(playListe, musique1));
		System.out.println(playListe.ajouterMusique(playListe, musique2));
		System.out.println(playListe.ajouterMusique(playListe, musique3));
		System.out.println(playListe.ajouterMusique(playListe, musique4));
		System.out.println(playListe.ajouterMusique(playListe, musique5));
		System.out.println(playListe.ajouterMusique(playListe, musique6));
		System.out.println(playListe.afficherMusiques(playListe));
		PlayListeImpl playListe1 = new PlayListeImpl("nom2", "genre2", 6, array);
		System.out.println(playListe1.ajouterMusique(playListe1, musique1));
		System.out.println(playListe1.ajouterMusique(playListe1, musique2));
		System.out.println(playListe1.ajouterMusique(playListe1, musique3));
		System.out.println(playListe1.ajouterMusique(playListe1, musique4));
		System.out.println(playListe1.ajouterMusique(playListe1, musique5));
		System.out.println(playListe1.ajouterMusique(playListe1, musique6));
		System.out.println(playListe1.afficherMusiques(playListe1));
		ArrayList<PlayListeImpl> arrayPlayListe = new ArrayList<PlayListeImpl>();
		arrayPlayListe.add(playListe);
		arrayPlayListe.add(playListe1);
		
		

		User user = new User("Takwa", "Touzni", "TATI", arrayPlayListe);
		System.out.println("L'utilisateur " + user.getNom() + " " + user.getPrenom()
				+ " a ses playlistes suivantes avec chacune ses musiques ");
		for (PlayListeImpl playListeImpl : arrayPlayListe) {
			System.out.println("* Play liste : " + playListeImpl.getNom() + " " + playListeImpl.getGenre()
					+ " avec ses musiques suivantes : ");
			ArrayList<MusiqueImpl> arrayMusiques = playListeImpl.getArray();
			for (MusiqueImpl musiqueImpl : arrayMusiques) {
				System.out.println("     - Musique : " + musiqueImpl.getTitre() + " de l'auteur : " + musiqueImpl.getAutheur());
			}
		}

	}

	private MusiqueImpl rechercherMusiqueParTitre(ArrayList<MusiqueImpl> array, String titre) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(titre)) {
				return musiqueImpl;
			}
		}
		return null;
	}

	private MusiqueImpl rechercherMusiqueParAuteur(ArrayList<MusiqueImpl> array, String auteur) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(auteur)) {
				return musiqueImpl;
			}
		}
		return null;
	}

	//Fnction supprimée//
	public void SupprimerMusique(ArrayList<MusiqueImpl> playlist, String Musique1) {
		for(MusiqueImpl m: playlist) {
		if(m.getTitre().equals(Musique1)) {
		playlist.remove(m);
		System.out.println ("Musique Supprimée");
		break;
		}
		}
		}
}
