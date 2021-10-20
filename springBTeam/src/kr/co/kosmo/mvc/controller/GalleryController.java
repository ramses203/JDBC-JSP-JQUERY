package kr.co.kosmo.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.kosmo.mvc.dao.GalleryDaoInter;
import kr.co.kosmo.mvc.dto.MygalleryDTO;

@Controller
public class GalleryController {
	
	@Autowired
	private GalleryDaoInter galleryDaoInter; 
	
		@GetMapping("/galleryList")
		public String galleryList(Model m) {
			List<MygalleryDTO> list = galleryDaoInter.listGallery();
			m.addAttribute("list", list);
			return "gallery/galleryList";
		}
		
		@GetMapping("/galleryForm")
		public String galleryForm() {
			return "gallery/galleryForm";
		}
		
		@PostMapping("/galleryInsert")
		public String galleryInsert(MygalleryDTO vo, HttpServletRequest request) {
			String img_path = "resources\\img";
			String r_path = request.getRealPath("/");
			System.out.println("r_path:"+r_path);
			String oriFn = vo.getMfile().getOriginalFilename();
			System.out.println("oriFn:"+oriFn);
			// 파일의 경로와 파일 이름을 조합
			StringBuffer path = new StringBuffer();
			path.append(r_path).append(img_path).append("\\");
			path.append(oriFn);
			System.out.println("FullPath:"+path);
			// 부가정보
			long size = vo.getMfile().getSize();
			String contentType = vo.getMfile().getContentType();
			System.out.println("파일크기:"+size);
			System.out.println("콘텐츠 타입:"+contentType);
			//지정한 파일 경로에 파일 객체를 생성해서 복사
			File f = new File(path.toString());
			try {
				vo.getMfile().transferTo(f);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			//입력처리
			vo.setImgn(oriFn);
			galleryDaoInter.addGallery(vo);
			
			return "gallery/galleryForm";
		}
		
		
}
