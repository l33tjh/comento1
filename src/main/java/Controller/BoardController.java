package Controller;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.BoardVO;
import service.BoardService;

@Controller

@RequestMapping(value = "/")

public class BoardController {
	@Inject
	private BoardService service;
	@GetMapping("/listAll")
	public void listAll(Model model)throws Exception {
		model.addAttribute("list",service.listAll());
	}
	@GetMapping("/regist")
	  public void registerGET(BoardVO board, Model model) throws Exception {
	}
	@PostMapping("/regist")
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		service.regist(board);
		return "redirect:/listAll";
	}
	@GetMapping("/read")
	  public void read(@RequestParam("bno")int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	  }
	
	 @GetMapping("/modify")
	  public void modifyGET(int bno, Model model) throws Exception {
	    model.addAttribute(service.read(bno)); 
	  }
	  @PostMapping("/modify")
	  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
	    service.modify(board);
	    return "redirect:/listAll";
	  }
	  @PostMapping("/remove")

	  public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		  service.remove(bno);
		  return "redirect:/listAll";
	  }
}