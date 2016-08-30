/**
 * 
 */
package com.mum.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.domain.Leave;
import com.mum.services.HolidaysService;
import com.mum.services.LeaveService;

/**
 * @author ashok
 *
 */
@Controller
public class LeaveController {
	@Autowired
	LeaveService leaveService;
	@Autowired
	HolidaysService holidaysService;

	@RequestMapping(value = "/leave", method = RequestMethod.GET)
	public String applyLeave(@ModelAttribute("leave") Leave leave, Model model) {
		model.addAttribute("holidaysList", holidaysService.getAll());
		return "leaveForm";
	}

	@RequestMapping(value = "/leave", method = RequestMethod.POST)
	public String saveLeave(@ModelAttribute("leave") Leave leave) {
		// String datefrom = leave.getLeaveFromDate().toString();
		// String dateTo = leave.getLeaveToDate().toString();
		// SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
		// try {
		// Date date1 = format.parse(datefrom);
		// Date date2 = format.parse(dateTo);
		// leave.setLeaveFromDate(date1);
		// leave.setLeaveToDate(date2);
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// leave.setLeaveFromDate(leave.getAppliedDate().getMonth()-);
		leaveService.save(leave);
		// return "redirect:/leaveForm";
		return "asd";
	}

	@RequestMapping(value = "/leaveList", method = RequestMethod.GET)
	public String leaveList(@ModelAttribute("leave") Leave leave, Model model) {
//		List<Leave> leaveList = leaveService.getAll();
//		for (int i = 0; i < leaveList.size(); i++) {
//
//		}
		model.addAttribute("leaveList", leaveService.getAll());
		// return "redirect:/leaveForm";
		return "leaveList";
	}

}
